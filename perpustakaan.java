public class perpustakaan_over extends kartuperpus_over
{

	private String perpus;
	
	perpustakaan_over (String nama, String nim, String fakultas, String jurusan, String alamat, String no_tlp, String perpus)
	{
		super(nama, nim, fakultas, jurusan, alamat, no_tlp);
		this.perpus=perpus;
	}
	
	public  String getPerpus()
	{
		return perpus;
	}
	//overide
		public void NamaPerpus()
		{
			System.out.println("Perpustakaan UIN Bandung");
		}
	public String tampilan2()
	{
		return ("Nama		: "+getNama()+" \nNIM		: "+getNim()+"\nFakultas	: "+getFakultas()+" \nJurusan		: "+getJurusan()+" \nAlamat		: "+getAlamat()+"\nNo Telepon	: "+getNo_tlp());
	}
}