package com.tech.ih.app.config;

import java.awt.image.BufferedImage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.BufferedImageHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;

/**
 * TODO remandal This type ...
 *
 */
@Configuration
public class ApplicationConfiguration {

  /**
   * Buffered Image converter
   *
   * @return
   */
  @Bean
  public HttpMessageConverter<BufferedImage> httpMessageConverter() {

    return new BufferedImageHttpMessageConverter();
  }
}
