package com.upa.ropa.saopservice;

import java.util.List;

import javax.jws.WebService;

import com.upa.ropa.producto.Ropa;


@WebService
public interface RopaService {
	
	public Ropa crearRopa(Ropa ropa);
	public List<Ropa> optenerTodaLaRopa();
	

}
