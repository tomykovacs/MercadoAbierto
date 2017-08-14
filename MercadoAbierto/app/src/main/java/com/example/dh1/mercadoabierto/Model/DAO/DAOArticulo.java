package com.example.dh1.mercadoabierto.Model.DAO;

import com.example.dh1.mercadoabierto.Model.POJO.Articulo;
import com.example.dh1.mercadoabierto.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tomy on 14/08/17.
 */

public class DAOArticulo {
    public List<Articulo> getArticulos() {
        List<Articulo> articulos = new ArrayList<>();
        articulos.add(new Articulo("Iphone 7 black", "$18000", "64GB, Pantalla Retina HD widescreen de 4.7 pulgadas (diagonal) retroiluminada por LED Multi-Touch con tecnología IPSResolución de 1334 x 750 pixeles a 326 ppi. Camara de 12 MP. Procesador A10. iOS" , R.drawable.iphone7negro));
        articulos.add(new Articulo("Iphone 7 red", "$18000", "64GB, Pantalla Retina HD widescreen de 4.7 pulgadas (diagonal) retroiluminada por LED Multi-Touch con tecnología IPSResolución de 1334 x 750 pixeles a 326 ppi. Camara de 12 MP. Procesador A10. iOS", R.drawable.iphone7rojo));
        articulos.add(new Articulo("Iphone 7 pink", "$18000", "64GB, Pantalla Retina HD widescreen de 4.7 pulgadas (diagonal) retroiluminada por LED Multi-Touch con tecnología IPSResolución de 1334 x 750 pixeles a 326 ppi. Camara de 12 MP. Procesador A10. iOS", R.drawable.iphone7rosa));
        articulos.add(new Articulo("Iphone 7 white", "$18000", "64GB, Pantalla Retina HD widescreen de 4.7 pulgadas (diagonal) retroiluminada por LED Multi-Touch con tecnología IPSResolución de 1334 x 750 pixeles a 326 ppi. Camara de 12 MP. Procesador A10. iOS", R.drawable.iphone7blanco));
        articulos.add(new Articulo("Iphone 7 plus black", "$25000", "128GB, Pantalla Retina HD widescreen de 5.5 pulgadas (diagonal) retroiluminada por LED Multi-Touch con tecnología IPS Resolución de 1920 x 1080 pixeles a 401 ppi. Camara de 12 MP con gran angular y teleobjetivo. Procesador A10. iOS", R.drawable.iphone7plusnegro));
        articulos.add(new Articulo("Samsung galaxy S7 Onyx", "$16000", "32 GB. Procesador Octa-Core. Pantalla de 5.1 pulgadas (diagonal) 2560 x 1440 (Quad HD) Super AMOLED. Camara Dual Pixel 12 MP. 4GB de RAM. Android", R.drawable.samsungs7negro));
        articulos.add(new Articulo("Samsung galaxy S7 Gold Platinum", "$16000", "32 GB. Procesador Octa-Core. Pantalla de 5.1 pulgadas (diagonal) 2560 x 1440 (Quad HD) Super AMOLED. Camara Dual Pixel 12 MP. 4GB de RAM. Android", R.drawable.samsungs7gold));
        articulos.add(new Articulo("Samsung galaxy S7 Silver", "$16000", "32 GB. Procesador Octa-Core. Pantalla de 5.1 pulgadas (diagonal) 2560 x 1440 (Quad HD) Super AMOLED. Camara Dual Pixel 12 MP. 4GB de RAM. Android", R.drawable.samsungs7silver));
        articulos.add(new Articulo("Samsung galaxy S7 Blue Coral", "$16500", "32 GB. Procesador Octa-Core. Pantalla de 5.1 pulgadas (diagonal) 2560 x 1440 (Quad HD) Super AMOLED. Camara Dual Pixel 12 MP. 4GB de RAM. Android", R.drawable.samsungs7blue));
        articulos.add(new Articulo("Samsung galaxy S7 Pink Gold", "$16500", "32 GB. Procesador Octa-Core. Pantalla de 5.1 pulgadas (diagonal) 2560 x 1440 (Quad HD) Super AMOLED. Camara Dual Pixel 12 MP. 4GB de RAM. Android", R.drawable.samsungs7pinkgold));
        return articulos;
    }
}
