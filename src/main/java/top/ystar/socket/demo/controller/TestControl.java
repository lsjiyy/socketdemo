package top.ystar.socket.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.ystar.socket.demo.server.WebSocketServer;

import java.io.IOException;

/**
 * @Author LsjYy
 * @DATE 2020-04-09 20:14
 * @Description:
 */
@RestController
@Slf4j
public class TestControl {

    @RequestMapping("/push/{toUserId}")
    public ResponseEntity<String> pushToWeb(String message, @PathVariable String toUserId) throws IOException {
        WebSocketServer.sendInfo(message,toUserId);
        return ResponseEntity.ok("MSG SEND SUCCESS");
    }

}
