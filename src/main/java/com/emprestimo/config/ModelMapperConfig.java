package com.emprestimo.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**Classe de configuração para fazer um inject do mapper nas classes
* @author Valnei Pereira
* @version ??
* @since Release 02 da aplicação
*/
@Configuration
public class ModelMapperConfig {

	@Bean
	public ModelMapper getBean() {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper;
	}
}