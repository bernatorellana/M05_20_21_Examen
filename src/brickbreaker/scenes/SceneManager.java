/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreaker.scenes;

/**
 *
 * @author bernat
 */
public class SceneManager {
    private int id;
    private String name;
    private int[][] matrix;

    public SceneManager(int id, String name, int[][] matrix) {
        this.id = id;
        this.name = name;
        this.matrix = matrix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    
    
}
