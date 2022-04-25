package com.s1mpleqaq.lianxi01;

public class Body {
    private Boolean live = true;

    public Boolean getLive() {
        return live;
    }

    public void setLive(Boolean live) {
        this.live = live;
    }

    class Heart{
        void beat(){
            if(live==true){
                System.out.println("心脏在跳动");
            }else {
                System.out.println("心脏停止跳动");
            }
        }
    }
}
