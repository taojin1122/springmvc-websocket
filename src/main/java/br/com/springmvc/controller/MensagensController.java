package br.com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.springmvc.websocket.MensagensWebsocket;

@Controller
public class MensagensController {
	
	@RequestMapping("/envia")
	public String cadastra(String mensagem) throws Exception {
		MensagensWebsocket.sendMessage(mensagem);
		return "server";
	}

}
