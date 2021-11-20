package com.example.clazzdemo.abstrazt;

import com.example.clazzdemo.interfaze.IArmyFactory;
import com.example.clazzdemo.produzt.PaoDan;
import com.example.clazzdemo.produzt.Paotong;
import com.example.clazzdemo.produzt.TankBody;
import com.example.clazzdemo.produzt.TankLD;

public abstract class AbstractTankFactory implements IArmyFactory {

    @Override
    public Paotong newPT() {
        return new Paotong();
    }

    @Override
    public TankBody newTB() {
        return new TankBody();
    }

    @Override
    public TankLD newTLD() {
        return new TankLD();
    }

    @Override
    public PaoDan newPD() {
        return new PaoDan();
    }
}
