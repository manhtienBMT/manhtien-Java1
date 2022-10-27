package com.poly.entity;

/**
 *
 * @author manht
 */
class pattern {
    
    // Kiem tra ma NV
    public boolean ktMA(String sc){
        String pattern = "[a-zA-Z]{2}\\d{5}"; // Yeu cau: 2 ki tu va 5 chu so ex: nv11111
        return sc.matches(pattern);
    }
    
    // Kiem tra ten NV
    public boolean ktTen(String sc) {
        String pattern = "[a-zA-Z\\s]{1,30}"; // Yeu cau: la chu va tu 1 - 30 ki tu
        return sc.matches(pattern);
    }
    
}
