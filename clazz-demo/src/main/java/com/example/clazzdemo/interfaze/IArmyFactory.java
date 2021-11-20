package com.example.clazzdemo.interfaze;

import com.example.clazzdemo.produzt.*;

public interface IArmyFactory {

    FangDanYi newFDY();
    PaoDan newPD();
    Paotong newPT();
    Qianggan newQG();
    QiangTi newQT();
    TankBody newTB();
    TankLD newTLD();
    ZiDan newZD();

}
