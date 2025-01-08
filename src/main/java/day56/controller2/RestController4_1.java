package day56.controller2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/day56/rest4")
public class RestController4_1 {

    @GetMapping("")
    public boolean getRest4(@RequestParam String key1, @RequestParam String key2) {
        System.out.println("RestController4_1.getRest4");
        System.out.println("key1 = " + key1 + ", key2 = " + key2);
        return true;
    }

    @GetMapping("/dto")
    public boolean getRest44(RestDto_1 restDto_1) {
        System.out.println("RestController4_1.getRest44");
        System.out.println("restDto_1 = " + restDto_1);
        return false;
    }

    @PostMapping("")
    public String postRest4(@RequestBody RestDto_1 restDto_1) {
        System.out.println("RestController4_1.postRest4");
        System.out.println("restDto_1 = " + restDto_1);
        return "응답 보내기";
    }

}
