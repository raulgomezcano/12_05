package com.softtek.modelo;

public class Dado {
    private int resultado;

    public Dado() {
        this.resultado = (int) (Math.random() * 6) + 1;
    }

    public void generar_numero() {
        this.resultado = (int) (Math.random() * 6) + 1;
        lanzar();
    }

    public void lanzar() {
        switch (this.resultado) {
            case 1:
                System.out.println("\n       \n   *   \n       \n");
                break;
            case 2:
                System.out.println("\n *     \n       \n     * \n");
                break;
            case 3:
                System.out.println("\n *     \n   *   \n     * \n");
                break;
            case 4:
                System.out.println("\n *   * \n       \n *   * \n");
                break;
            case 5:
                System.out.println("\n *   * \n   *   \n *   * \n");
                break;
            case 6:
                System.out.println("\n *   * \n *   * \n *   * \n");
                break;
        }
    }
}
