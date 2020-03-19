/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotica;

/**
 *
 * @author sebastian
 */
public class Libro {
    
    private String id;
    private String titulo;
    private String editorial;
    private String autor;
    private int no_paginas;
    private int unidades;

    public Libro(String id, String titulo, String editorial, String autor, int no_paginas, int unidades) {
        this.id = id;
        this.titulo = titulo;
        this.editorial = editorial;
        this.autor = autor;
        this.no_paginas = no_paginas;
        this.unidades = unidades;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNo_paginas() {
        return no_paginas;
    }

    public void setNo_paginas(int no_paginas) {
        this.no_paginas = no_paginas;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
}
