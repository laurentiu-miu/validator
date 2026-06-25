package rest.api.client;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Consumer;

@Slf4j
public class Mailer {
    private Mailer() {}
    public Mailer from(String addr) {log.info("from: {}",addr);return this;}
    public Mailer to(String addr) {log.info("to: {}",addr);return this;}
    public Mailer subject(String text) {log.info("subject: {}",text);return this;}
    public Mailer body(String text) {log.info("body: {}",text);return this;}
    public static void send(Consumer<Mailer> block) {
        Mailer mailer = new Mailer();
        block.accept(mailer);
        log.info("... sending ...");
    }
}
