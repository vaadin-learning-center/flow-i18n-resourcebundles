package junit.com.vaadin.tutorial.flow.i18n.resourcebundles.v01;

import java.util.ListResourceBundle;

public class VaadinAppResource_en extends ListResourceBundle {

  @Override
  protected Object[][] getContents() {
    return new Object[][]{
        {"s1" , "value 01 - en"} ,
        {"s2" , "value 02 - en"}
    };
  }
}
