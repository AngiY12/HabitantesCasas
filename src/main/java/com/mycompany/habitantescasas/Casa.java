/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.habitantescasas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Casa {
    private String direccion;
    private List<Persona> habitantes;
    
    public Casa (String direccion)
    {
        this.direccion = direccion;
        this.habitantes = new ArrayList<>();
    }

    public List<Persona> getHabitantes() {
        return habitantes;
    }


    public String getDireccion() {
        return direccion;
    }
    
    public void agregarHabitante(Persona persona)
    {
        habitantes.add(persona);
    }     
}