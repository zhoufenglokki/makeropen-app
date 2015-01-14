package makeropen.testcase;

import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.makeropen.edgeserver.domain.Hangout;
import com.makeropen.edgeserver.manager.HangoutManager;

@ContextConfiguration("/edgeserverConfig/spring-context.xml")
public class SpringTest extends AbstractJUnit4SpringContextTests {

	@Resource(name="hangoutManager")
	HangoutManager hangoutManager;

	@Test
	public void test(){
		Map<String, Hangout> hangoutMap = hangoutManager.queryHangoutMapByCity();
		System.err.println(hangoutMap.get("1"));
	}
}
