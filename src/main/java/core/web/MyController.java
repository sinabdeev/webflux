package core.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/hello1")
    public Mono<String> hello1() {

        try {
            Thread.sleep(300);
        } catch (Exception e) {

        }

        return Mono.just("Lincoln");
    }

    @GetMapping("/hello2")
    public String hello2() {

        try {
            Thread.sleep(300);
        } catch (Exception e) {

        }

        return "William";
    }
}
