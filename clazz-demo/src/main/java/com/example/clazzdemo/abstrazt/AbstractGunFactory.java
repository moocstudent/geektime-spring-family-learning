package com.example.clazzdemo.abstrazt;

import com.example.clazzdemo.interfaze.IArmyFactory;
import com.example.clazzdemo.produzt.FangDanYi;
import com.example.clazzdemo.produzt.QiangTi;
import com.example.clazzdemo.produzt.Qianggan;
import com.example.clazzdemo.produzt.ZiDan;

public abstract class AbstractGunFactory implements IArmyFactory {

    @Override
    public Qianggan newQG() {
        return new Qianggan();
    }

    @Override
    public QiangTi newQT(){
        return new QiangTi();
    }

    @Override
    public ZiDan newZD(){
        return new ZiDan();
    }

    @Override
    public FangDanYi newFDY() {
        return new FangDanYi();
    }
}
