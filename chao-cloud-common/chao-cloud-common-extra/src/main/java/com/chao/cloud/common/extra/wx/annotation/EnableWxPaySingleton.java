package com.chao.cloud.common.extra.wx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

/**
 * 微信支付单例模式（只有一个appid）
 * @功能：
 * @author： 薛超
 * @时间：2019年7月11日
 * @version 1.0.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(WxPaySingletonConfig.class)
public @interface EnableWxPaySingleton {

}