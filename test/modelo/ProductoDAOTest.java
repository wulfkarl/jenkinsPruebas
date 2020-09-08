/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author diego
 */
public class ProductoDAOTest {
    
    public ProductoDAOTest() {
    }

    /**
     * Test of buscar method, of class ProductoDAO.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        int id = 0;
        ProductoDAO instance = new ProductoDAO();
        Producto expResult = null;
        Producto result = instance.buscar(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result.equals(id)) {
            fail("The test case is a prototype.");
        }
        
        
    }

    /**
     * Test of actualizarStock method, of class ProductoDAO.
     */
    @Test
    public void testActualizarStock() {
        System.out.println("actualizarStock");
        int id = 0;
        int stock = 0;
        ProductoDAO instance = new ProductoDAO();
        int expResult = 0;
        int result = instance.actualizarStock(id, stock);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarId method, of class ProductoDAO.
     */
    @Test
    public void testListarId() {
        System.out.println("listarId");
        int id = 0;
        ProductoDAO instance = new ProductoDAO();
        Producto expResult = null;
        Producto result = instance.listarId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listar method, of class ProductoDAO.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        ProductoDAO instance = new ProductoDAO();
        List expResult = null;
        List result = instance.listar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarImg method, of class ProductoDAO.
     */
    @Test
    public void testListarImg() {
        System.out.println("listarImg");
        int id = 0;
        HttpServletResponse response = null;
        ProductoDAO instance = new ProductoDAO();
        instance.listarImg(id, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregar method, of class ProductoDAO.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        Producto p = null;
        ProductoDAO instance = new ProductoDAO();
        int expResult = 0;
        int result = instance.agregar(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class ProductoDAO.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        Producto p = null;
        ProductoDAO instance = new ProductoDAO();
        int expResult = 0;
        int result = instance.actualizar(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ProductoDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        ProductoDAO instance = new ProductoDAO();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
