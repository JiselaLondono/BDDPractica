package com.co.reto.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public final class UtestMenu {

  public static final Target MENU_OPTION =
      Target.the("Button to select menu option of UTest")
          .locatedBy("//div[contains(@class, 'unauthenticated-nav-bar__links')]//a[text()='{0}']");

  public UtestMenu() {}
}
