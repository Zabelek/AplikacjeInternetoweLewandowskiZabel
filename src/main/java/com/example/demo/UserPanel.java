package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;



@Route("/User")
public class UserPanel extends VerticalLayout {
	
	@Autowired
	private UsersRepository repo;
	
	@Autowired
	private DelegationService service2;

	private Button btnDodajZapisanie, btnDodajListe, btnEdytujZadanie, btnWycofanie;
	
    public UserPanel() {
    	btnDodajZapisanie = new Button("Zapisz do PDF");
    	btnDodajListe = new Button("Wydrukuj");
    	btnEdytujZadanie = new Button("Potwierdz Przyjęcie");
    	btnWycofanie = new Button("Wycofaj Potwierdzenie Delegacji");
        add(new Text("Welcome to User Panel."));
        
        add(btnDodajZapisanie, btnDodajListe, btnEdytujZadanie, btnWycofanie);
       
        btnDodajZapisanie.addClickListener(e->{
        	service2.toPdf();
        });
        btnDodajListe.addClickListener(e->{
        	service2.drukuj();
        });
        btnEdytujZadanie.addClickListener(e->{
        		service2.edytuj();
        });
        btnWycofanie.addClickListener(e->{
        	service2.wycofaj();
        });
    }

}