package com.example.dh1.mercadoabierto.Controller;

import com.example.dh1.mercadoabierto.Model.DAO.DAOArticulo;
import com.example.dh1.mercadoabierto.Model.POJO.Articulo;

import java.util.List;

/**
 * Created by tomy on 14/08/17.
 */

public class Controller {
    public List<Articulo> getArticulos() {
        DAOArticulo daoArticulo = new DAOArticulo();
        return daoArticulo.getArticulos();
    }
}
