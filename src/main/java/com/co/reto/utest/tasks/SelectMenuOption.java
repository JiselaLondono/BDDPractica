package com.co.reto.utest.tasks;

import static com.co.reto.utest.userinterface.UtestMenu.MENU_OPTION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SelectMenuOption implements Task {

  private String menuOption;

  public SelectMenuOption(String menuOption) {
    this.menuOption = menuOption;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(MENU_OPTION.of(menuOption)));
  }

  public static SelectMenuOption named(String menuOption) {
    return instrumented(SelectMenuOption.class, menuOption);
  }
}
