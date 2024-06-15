class BuilderDesignPattern {
	
	public static void main(String[] args) {
		Computer.Builder builder = new Computer.Builder();
		Computer com = builder.name("APPLE")
							  .processor("M1")
							  .ram(16)
							  .build();
		System.out.println(com.toString());
	}
}


class Computer {

	private String name;
	private String processor;
	private int ram;

	public Computer(Builder builder) {
		this.name = builder.name;
		this.processor = builder.processor;
		this.ram = builder.ram;
	}

	static class Builder {
		private String name;
		private String processor;
		private int ram;

		Computer build() {
			return new Computer(this);
		}

		Builder() {}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder processor(String processor) {
			this.processor = processor;
			return this;
		}

		public Builder ram(int ram) {
			this.ram = ram;
			return this;
		}
	}

	@Override
	public String toString() {
		return "Computer {" +
				" Name - " + this.name + 
				" Processor - " + this.processor + 
				" Ram - " + this.ram +
				" }";
	}
}