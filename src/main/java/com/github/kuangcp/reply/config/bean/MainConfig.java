package com.github.kuangcp.reply.config.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by https://github.com/kuangcp on 17-11-28  下午7:36
 *
 * @author kuangcp
 */
@Data
@Component
@ConfigurationProperties(prefix = "reply.main")
public class MainConfig {
    private String name;
    private String url;
}