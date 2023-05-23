package com.adpter;

class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    // Verifica se um pino redondo se encaixa no buraco
    public boolean fits(RoundPeg peg) {
        return this.getRadius() >= peg.getRadius();
    }
}

class RoundPeg {
    private double radius;

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
}

// Adaptador que permite que um pino quadrado seja usado como um pino redondo
class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    // Construtor que recebe um pino quadrado e cria o adaptador como um pino redondo de raio zero
    public SquarePegAdapter(SquarePeg peg) {
        super(0);
        this.peg = peg;
    }

    // Calcula o raio necessário para que um pino quadrado se encaixe em um buraco redondo
    public double getRadius() {
        return peg.getWidth() * Math.sqrt(2) / 2;
    }
}

public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        System.out.println(hole.fits(rpeg));

        SquarePeg smallSqpeg = new SquarePeg(5);
        SquarePeg largeSqpeg = new SquarePeg(10);
        // System.out.println(hole.fits(smallSqpeg)); // Isso não vai ser compilado

        SquarePegAdapter smallSqpegAdapter = new SquarePegAdapter(smallSqpeg);
        SquarePegAdapter largeSqpegAdapter = new SquarePegAdapter(largeSqpeg);
        System.out.println(hole.fits(smallSqpegAdapter));
        System.out.println(hole.fits(largeSqpegAdapter));
    }
}
