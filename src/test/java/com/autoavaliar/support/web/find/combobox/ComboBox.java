package com.autoavaliar.support.web.find.combobox;

import com.autoavaliar.intern.Instances;

public class ComboBox {
    public SetterComboBox set(){
        return Instances.getSetterComboBoxClassInstance();
    }

    public GetterComboBox get(){
        return Instances.getGetterComboBoxClassInstance();
    }
}
