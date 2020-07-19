package ink.bignose.catmall.authserver.feign;

import ink.bignose.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/17  17:32
 * DESCRIPTION:
 **/
@FeignClient("mall-third-party")
public interface ThirdPartyFeign {

    @GetMapping("/sms/send")
    R sendSMSCode(@RequestParam("phone") String phone, @RequestParam("code") String code);

}
