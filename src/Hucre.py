
class Hucre:

    def __init__(self, x,y,DNA,r,mit_sayisi,besin_mik,enerji,fotosentez_yapapilir_mi):
        self.x = x
        self.y = y
        self.DNA = DNA
        self.r = r
        self.mit_sayisi = mit_sayisi
        self.besin_mik = besin_mik
        self.enerji = enerji
        self.fotosentez_yapapilir_mi = fotosentez_yapapilir_mi

    def hareket_et(self,x_hareket,y_hareket):
        self.x += x_hareket
        self.y += y_hareket
        self.besin_mik -= (x_hareket+y_hareket)

    def beslen(self,besin):
        self.besin_mik += besin

    def sindir(self,besin):
        self.besin_mik -= besin
        self.enerji += besin

    def __str__(self) -> str:
        content = ""
        content += f"Konum : \nx: {self.x}\ny: {self.y}"
        content += f"\nBesin: {self.besin_mik}"
        return content

h1 = Hucre(10,7,"ATGGTAAAAT",4,10,415,49,True)
h2 = Hucre(3,1,"TTTTTAATTGA",2,11,45,100,False)
h3 = Hucre(13,100,"TTTTTAATTGA",2,11,45,100,False)

print("H1: ",h1)
print("H2: ",h2)
print("H3: ",h3)

h2.hareket_et(3,1)
h1.hareket_et(10,4)

h1.beslen(1000)


print("H1: ",h1)
print("H2: ",h2)
print("H3: ",h3)
