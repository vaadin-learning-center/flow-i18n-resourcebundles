package com.vaadin.tutorial.flow.i18n.resourcebundles;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.concurrent.ConcurrentHashMap;

public class VaadinResourceBundle extends ResourceBundle {


  private  Map<String, String> values = new ConcurrentHashMap<>();

  // the technical decision how to create a variant for a Locale
  public static ResourceBundle forLocale(Locale locale) {

    final VaadinResourceBundle resourceBundle = new VaadinResourceBundle();
    if (locale.equals(Locale.GERMAN)) {
      resourceBundle.values.put("btn.click-me" , "drück mich");
    }

    if (locale.equals(Locale.ENGLISH)) {
      resourceBundle.values.put("btn.click-me" , "click me");
    }
    return resourceBundle;
  }

  @Override
  protected Object handleGetObject(String key) {
    return values.get(key);
  }

  @Override
  public Enumeration<String> getKeys() {
    return Collections.enumeration(values.keySet());
  }
}
