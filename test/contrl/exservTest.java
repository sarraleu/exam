/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contrl;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 *
 * @author cash express
 */
public class exservTest {
    
    public exservTest() {
    }
    
    
    @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        HttpServletRequest request =mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        RequestDispatcher dispatcher=mock(RequestDispatcher.class);
        when(Integer.parseInt(request.getParameter("note1"))).thenReturn(5);
        when(Integer.parseInt(request.getParameter("note2"))).thenReturn(7);
        when(request.getRequestDispatcher("exjsp.jsp")).thenReturn(dispatcher);
        exserv instance = new exserv();
        instance.doPost(request, response);
       verify(dispatcher).forward(request,response);
    }
    
}
