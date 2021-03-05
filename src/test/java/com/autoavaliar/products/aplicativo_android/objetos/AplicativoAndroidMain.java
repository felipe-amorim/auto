package com.autoavaliar.products.aplicativo_android.objetos;

import java.util.LinkedHashMap;

public class AplicativoAndroidMain {

    public static String aplicativoAndroidMainMaisButton = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton";
    public static String aplicativoAndroidMainCarroButton = "com.autoaction.app:id/home_fab_menu_car";
    public static String aplicativoAndroidMainMotoButton = "com.autoaction.app:id/home_fab_menu_bike";
    public static String aplicativoAndroidMainCaminhaoButton = "com.autoaction.app:id/home_fab_menu_truck";
    public static String APLICATIVO_ANDROID_MAIN_REALIZADAS = "//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Realizadas\"]";
    public static String APLICATIVO_ANDROID_MAIN_REALIZADAS_CARDS = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView[2]";


    public static LinkedHashMap<String, String> aplicativoAndroidMain = createData();
    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();
        ret.put(aplicativoAndroidMainMaisButton, "Mais");
        ret.put(aplicativoAndroidMainCarroButton, "Carro");
        ret.put(aplicativoAndroidMainMotoButton, "Moto");
        ret.put(aplicativoAndroidMainCaminhaoButton, "Caminhao");
        ret.put(APLICATIVO_ANDROID_MAIN_REALIZADAS, "Realizadas");
        ret.put(APLICATIVO_ANDROID_MAIN_REALIZADAS_CARDS, "Card Realizado");
        return ret;
    }
}
