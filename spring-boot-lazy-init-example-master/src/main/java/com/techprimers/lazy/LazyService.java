package com.techprimers.lazy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

//@Lazy
@Service
public class LazyService {
	
	static int id = 0;
	static List<K8s> k8s = new ArrayList<K8s>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			add(new K8s(++id, "Apple"));
			add(new K8s(++id, "Ball"));
			add(new K8s(++id, "Cat"));
		}		
	};
	

    public LazyService() {
        System.out.println("Lazy Service:: Constructor loaded");
    }
   

	public List<K8s> addNewUser(K8s user) {
		k8s.add(new K8s(++id, user.getName()));
		return k8s;
	}
}
