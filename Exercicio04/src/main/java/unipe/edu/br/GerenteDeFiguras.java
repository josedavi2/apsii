package unipe.edu.br;

import java.util.ArrayList;
import java.util.List;

public class GerenteDeFiguras {
    private List<FiguraGeometrica> figuras;

    public GerenteDeFiguras() {
        figuras = new ArrayList<FiguraGeometrica>();
    }


    public void adicionaFigura(FiguraGeometrica fig) {
        this.figuras.add(fig);
    }


    public double calculaAreaTotalDeFiguras() {
        double total = 0.0;
        for (FiguraGeometrica f : this.figuras) {
            total += f.calculaArea();
        }
        return total;
    }


    public List<FiguraGeometrica> getFiguras() {
        return this.figuras;
    }

    public void imprimeFiguras() {
        for (FiguraGeometrica f : this.figuras) {
            System.out.println(f.getNomeFigura());
        }
    }

 
    public double getMaiorAreaDeFigura() {
        double maiorArea = 0.0;
        for (FiguraGeometrica f : this.figuras) {
            double area = f.calculaArea();
            if (area > maiorArea) {
                maiorArea = area;
            }
        }
        return maiorArea;
    }
}
