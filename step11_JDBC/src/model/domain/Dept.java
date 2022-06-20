package model.domain;

public class Dept {
	private int deptno;
	private String dname;
	private String loc;

	public Dept(Builder builder) {
		this.deptno = builder.deptno;
		this.dname = builder.dname;
		this.loc = builder.loc;

	}

	public static class Builder {
		private int deptno;
		private String dname;
		private String loc;

		public Builder() {
		}

		public Builder deptno(int deptno) {
			this.deptno = deptno;
			return this; // this = builder 의미
		}

		public Builder dname(String dname) {
			this.dname = dname;
			return this; // this = builder 의미
		}

		public Builder loc(String loc) {
			this.loc = loc;
			return this; // this = builder 의미
		}

		public Dept build() {
			return new Dept(this); // Dept 안에는 기본 생성자 밖에 없기 때문에 내부에 Builder 가져올수 있게 해주기
		}
	}

}
