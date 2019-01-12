package junit.com.vaadin.tutorial.flow.i18n.resourcebundles.v01;

import java.util.ListResourceBundle;

public class VaadinAppResource extends ListResourceBundle {

  @Override
  protected Object[][] getContents() {
    return new Object[][]{
        {"s1" , "value 01"} ,
        {"s2" , "value 02"} ,
        {"s3" , "value 03"} ,
        {"s4" , "value 04"} ,
        {"s5" , "value 05"} ,
        {"s6" , "value 06"} ,
        {"s7" , "value 07"} ,
        {"s8" , "value 08"}
    };
  }
}
