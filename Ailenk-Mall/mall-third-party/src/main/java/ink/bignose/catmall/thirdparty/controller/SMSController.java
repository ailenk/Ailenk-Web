package ink.bignose.catmall.thirdparty.controller;

import ink.bignose.catmall.thirdparty.component.SMSComponent;
import ink.bignose.common.utils.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @AUTHOR: Ailenk
 * @DATETIME: 2019/5/17  17:26
 * DESCRIPTION:
 **/
@RequestMapping("/sms")
@RestController
public class SMSController {

    @Resource
    private SMSComponent smsComponent;

    @GetMapping("/send")
    public R sendSMSCode(@RequestParam("phone") String phone, @RequestParam("code") String code) {
        smsComponent.sendSMSCode(phone, code);
        return R.ok();
    }
}
