package br.com.snaketl.controllers;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;

@Controller
public class IndexController {
    
    @Get("/")
    public void index() {}
    
}
