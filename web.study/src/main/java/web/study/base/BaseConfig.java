package web.study.base;

import org.springframework.beans.factory.annotation.Value;

/**
 * 配置
 * @author dell
 *
 */
public class BaseConfig {

	/**
	 * 短信api名称
	 */
	@Value("${sms.product}")
	public String  smsProduct ;

	/**
	 * 短信api产品域名
	 */
	@Value("${sms.domain}")
	public String smsDomain;

	/**
	 * 
	 */
	@Value("${sms.accessKeyId}")
	public String smsAccessKeyId;

	/**
	 * 云秘钥 
	 */
	@Value("${sms.accessKeySecret}")
	public String smsAccessKeySecret ;

	/**
	 * 发送地
	 */
	@Value("${sms.address.send}")
	public String smsAddressSend ;
	
	/**
	 * 图灵机器人key
	 */
	@Value("${tu.ling.api.key}")
	public String tuLingApiKey ;
	
	
	/**
	 * 微信token
	 */
	@Value("${we.chat.token}")
	public String weChatToken;
	
	
}
