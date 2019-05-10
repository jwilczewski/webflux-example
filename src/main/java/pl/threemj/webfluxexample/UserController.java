package pl.threemj.webfluxexample;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.List;

@RestController
public class UserController {

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<User> findAll() {
        return Flux.fromIterable(List.of(
                User.builder().id("0001").name("Zdenek").familyname("Smetana").build(),
                User.builder().id("0002").name("Jan").familyname("Kowalski").build()))
                .delayElements(Duration.ofMillis(1000));
    }


}