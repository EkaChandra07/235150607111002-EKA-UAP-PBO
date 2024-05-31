public abstract class Tanaman {

    private int masaHidup;
    private int lamaHidup;
    private int berbuah;
    private int buah;
    private double perkembangan;
    private double prosesBerbuah;

    public Tanaman(int masaHidup, int berbuah, double perkembangan) {
        this.masaHidup = masaHidup;
        this.berbuah = berbuah;
        this.perkembangan = perkembangan;
        this.lamaHidup = 0;
        this.buah = 0;
        this.prosesBerbuah = 0.0;
    }

    public void berkembang() {
        this.lamaHidup += 60;
        if (lamaHidup <= masaHidup) {
            this.prosesBerbuah += perkembangan * 60;
            if (prosesBerbuah >= 1) {
                this.buah += (int) prosesBerbuah * berbuah;
                this.prosesBerbuah %= 1;
            }
        }
    }

    public String status() {
        return lamaHidup < masaHidup ? "hidup" : "mati";
    }

    public String toString() {
        return String.format("Masa hidup   : %d hari\nUmur Tanaman : %d hari\nMenghasilkan : %d buah %s\nStatus       : %s\n",
                masaHidup, lamaHidup, buah, this.getClass().getSimpleName().toLowerCase(), status());
    }

    public int getMasaHidup() {
        return masaHidup;
    }

    public int getLamaHidup() {
        return lamaHidup;
    }

    public int getBerbuah() {
        return berbuah;
    }

    public int getBuah() {
        return buah;
    }

    public double getPerkembangan() {
        return perkembangan;
    }

    public double getProsesBerbuah() {
        return prosesBerbuah;
    }
}