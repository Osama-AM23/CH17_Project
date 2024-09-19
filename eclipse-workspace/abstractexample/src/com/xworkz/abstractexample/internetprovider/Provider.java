package com.xworkz.abstractexample.internetprovider;

public abstract class Provider {

	public String name;
	public String ceo;

	public Provider(String name, String ceo) {
		super();
		this.name = name;
		this.ceo = ceo;
	}

	@Override
	public String toString() {
		return "Provider [name=" + name + ", ceo=" + ceo + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running a equals in Provider");

		if (obj != null) {

			if (obj instanceof Provider) {
				Provider pro = (Provider) obj;
				if (this.name.equals(pro.name) && this.ceo.equals(pro.ceo)) {
					System.out.println("Both are Equal");
					return true;
				}
			} else {
				System.out.println("Obj is Not a Provider");
			}

		} else {
			System.out.println("Obj is Null");
		}
		return super.equals(obj);
	}

	public abstract void service();

		
}
