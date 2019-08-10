package com.upa.ropa.saopservice;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.upa.ropa.producto.Ropa;
@WebService(endpointInterface = "com.upa.ropa.saopservice.RopaService")
public class RopaServiceImpl implements RopaService{
	
	static List<Ropa> ropaList = new ArrayList<Ropa>();

	@Override
	public Ropa crearRopa(Ropa ropa) {
		ropaList.add(ropa);
		return ropa;
	}

	@Override
	public List<Ropa> optenerTodaLaRopa() {
		return ropaList;
	}

}
