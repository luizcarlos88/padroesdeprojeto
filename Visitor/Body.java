package Visitor;

class Body implements CarElement {
	  @Override
	  public void accept(CarElementVisitor visitor) {
	      visitor.visit(this);
	  }
	}
