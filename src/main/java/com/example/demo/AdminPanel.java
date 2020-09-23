package com.example.demo;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;


@Route("/Admin")
public class AdminPanel extends VerticalLayout {

    VerticalLayout layout1 = new VerticalLayout();
    VerticalLayout layout2 = new VerticalLayout();
    VerticalLayout layout3 = new VerticalLayout();
    VerticalLayout layout4 = new VerticalLayout();
    VerticalLayout layout5 = new VerticalLayout();
    VerticalLayout layout6 = new VerticalLayout();


    Button deleteUserButton = new Button("Usuwanie uzytkownika");

    TextField userNameTF = new TextField("Podaj id uzytkownika: ");

    Button deletingDelegationButton = new Button("Usuwanie delegacji");

    TextField userIdTF = new TextField("Podaj id uzytkownika: ");
    TextField delegationIdTF = new TextField("Podaj id delegacji: ");

    Button delegationEditButton = new Button("Edycja delegacji");

    TextField delegationIdTF_1 = new TextField("Podaj id delegacji");
    TextField delegationStartTimeTF = new TextField("Podaj Czas rozpoczecia: ");
    TextField delegationEndTimeTF = new TextField("Podaj czas zakonczenia: ");
    TextField delegationDietTF = new TextField("Podaj diete: ");
    TextField breakfastCountTF = new TextField("Podaj ilosc sniadan: ");
    TextField dinnerCountTF = new TextField("Podaj ilosc obiadow: ");
    TextField supperCountTF = new TextField("Podaj ilosc kolacji: ");
    TextField transportTypeTF = new TextField("Podaj rodzaj transportu: ");
    TextField ticketPriceTF = new TextField("Podaj ceny biletow: ");
    TextField quaterPriceTF = new TextField("Podaj cene zakwaterowania: ");
    TextField otherTicketsTF = new TextField("Podaj innych biletow: ");

    Button adminRightsAssignmentButton = new Button("Przypisanie uprawnien administratora");

    TextField userIdTF_2 = new TextField("Podaj id uzytkownika: ");

    Button confirmDelegationButton = new Button("Potwierdzenie delegacji");

    TextField userNameTF_2 = new TextField("Podaj nazwe uzytkownika: ");
    TextField delegationNameTF = new TextField("Podaj nazwe delegacji: ");

    Button cancelDelegationButton = new Button("Cofniecie delegacji");

    TextField userNameTF_3 = new TextField("Podaj nazwe uzytkownika: ");
    TextField delegationName_3 = new TextField("Podaj nazwe delegacji: ");

   

    

    public AdminPanel() {
    	 deleteUserButton.addClickListener(clickEvent -> {
    	        String ladnie = userNameTF.getValue();
    	        RestCon C = new RestCon();
    	        int i = Integer.valueOf(ladnie);
    	        C.deleteUserById(i);
    	    });

    	    deletingDelegationButton.addClickListener(clickEvent -> {
    	        String ladnie = userIdTF.getValue();
    	        String brzydko = delegationIdTF.getValue();
    	        RestCon C = new RestCon();
    	        int k = Integer.valueOf(brzydko);
    	        int j = Integer.valueOf(ladnie);
    	        C.removeDelegation(j, k);
    	    });

    	    delegationEditButton.addClickListener(clickEvent -> {
    	        String ladnie = delegationIdTF_1.getValue();
    	        Delegation brzydko = new Delegation(delegationStartTimeTF.getValue(), delegationEndTimeTF.getValue(), delegationDietTF.getValue(), breakfastCountTF.getValue(), dinnerCountTF.getValue(), supperCountTF.getValue(), transportTypeTF.getValue(), ticketPriceTF.getValue(), quaterPriceTF.getValue(), otherTicketsTF.getValue());
    	        RestCon C = new RestCon();
    	        int j = Integer.valueOf(ladnie);
    	        C.changeDelegation(j, brzydko);
    	    });

    	    adminRightsAssignmentButton.addClickListener(clickEvent -> {
    	        String ladnie = userIdTF_2.getValue();
    	        RestCon C = new RestCon();
    	        int i = Integer.valueOf(ladnie);
    	        C.deleteUserById(i);
    	    });

    	    confirmDelegationButton.addClickListener(clickEvent -> {
    	        String ladnie = userNameTF_2.getValue();
    	        String brzydko = delegationNameTF.getValue();
    	        RestCon C = new RestCon();
    	        int k = Integer.valueOf(brzydko);
    	        int j = Integer.valueOf(ladnie);
    	        C.removeDelegation(j, k);
    	    });
    	layout1.add(deleteUserButton);
        layout1.add(userNameTF);
        layout1.setHeight("12.5%");

        layout2.add(deletingDelegationButton);
        layout2.add(userIdTF);
        layout2.add(delegationIdTF);
        layout2.setHeight("15%");

        layout3.add(delegationEditButton);
        layout3.add(delegationStartTimeTF);
        layout3.add(delegationEndTimeTF);
        layout3.add(delegationDietTF);
        layout3.add(breakfastCountTF);
        layout3.add(dinnerCountTF);
        layout3.add(supperCountTF);
        layout3.add(transportTypeTF);
        layout3.add(ticketPriceTF);
        layout3.add(quaterPriceTF);
        layout3.add(otherTicketsTF);
        layout3.setHeight("30%");

        layout4.add(adminRightsAssignmentButton);
        layout4.add(userIdTF_2);
        layout4.setHeight("12.5%");

        layout5.add(confirmDelegationButton);
        layout5.add(userNameTF_2);
        layout5.add(delegationNameTF);
        layout5.setHeight("15%");

        layout6.add(cancelDelegationButton);
        layout6.add(userNameTF_3);
        layout6.add(delegationName_3);
        layout6.setHeight("15%");
        add(new Text("Welcome to MainView."));
    }

}