class kartuperpus 
{
	protected String nama, nim, fakultas, jurusan, alamat, no_tlp;	
	protected kartuperpus(String nama, String nim, String fakultas, String jurusan, String alamat, no_tlp)
	{
		this.nama=nama;
		this.nim=nim;
		this.fakultas=fakultas;
		this.jurusan=jurusan;
		this.alamat=alamat;
		this.no_tlp=no_tlp;
	}
	
	public String getNama() 
	{
		return nama;
	}
	public String getNim() 
	{
		return nim;
	}
	public String getFakultas() 
	{
		return fakultas;
	}
	public String getJurusan() 
	{
		return jurusan;
	}
	public String getAlamat()
	{
		return alamat;
	}
	public String getNo_tlp()
	{
		return no_tlp;
	}
}