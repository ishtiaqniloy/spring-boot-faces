package com.dsi.JsfDemo.controller;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component(value = "home")
@ELBeanName(value = "home")
@Join(path = "/", to = "/index.jsf")
public class HomeController {
}
