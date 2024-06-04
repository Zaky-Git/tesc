import static org.junit.Assert.assertEquals;

import org.junit.Test;

import zaky.driver.Buku;

public class BukuTest {

    @Test
    public void testGetProduser() {
        Buku buku = new Buku("Buku MKPL", 10);
        assertEquals("zakyBook", buku.getProduser());
    }

}