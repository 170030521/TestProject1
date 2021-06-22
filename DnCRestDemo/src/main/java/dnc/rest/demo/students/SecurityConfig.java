package dnc.rest.demo.students;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.InMemoryUserDetailsManagerConfigurer;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.JdbcUserDetailsManagerConfigurer;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.UserDetailsManagerConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;



@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
   DataSource	 dataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//super.configure(auth);
		auth.jdbcAuthentication()
		 .dataSource(dataSource)
	      .withDefaultSchema().withUser(
	    		  User.withUsername("geetha").password("reddy").roles("ADMIN"))
	      .withUser(User.withUsername("phani").password("inahp").roles("USER"));
	    		 
	      
		
		
		//auth.inMemoryAuthentication()
		//.withUser("geetha")
		//.password("root")
		//.roles("USER")
		//.and()
		//.withUser("phani")
		//.password("inahp")
		//.roles("ADMIN");
	}
	private UserDetailsManagerConfigurer<AuthenticationManagerBuilder, JdbcUserDetailsManagerConfigurer<AuthenticationManagerBuilder>> dataSource(
			DataSource datasource2) {
		// TODO Auto-generated method stub
		return null;
	}
	private UserDetailsManagerConfigurer<AuthenticationManagerBuilder, InMemoryUserDetailsManagerConfigurer<AuthenticationManagerBuilder>> and() {
		// TODO Auto-generated method stub
		return null;
	}
	@Bean
	public PasswordEncoder getPasswordEncoder() {
	 return NoOpPasswordEncoder.getInstance();}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/user").hasAnyRole("USER","ADMIN")
		.antMatchers("/").permitAll()
	
		.and()
		.formLogin();}
}
