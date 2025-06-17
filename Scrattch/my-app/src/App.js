import React from 'react';
import Navbar from './Navbar/Navbar';
import { Main } from './Main/Main';
import { Sidebar } from './Sidebar/Sidebar';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import { faGithub, faLinkedin, faTwitter ,faSquareInstagram} from "@fortawesome/free-brands-svg-icons";
import Practice1 from './Practice1/Practice1';
import Mind from './Mind/Mind';

const App = () => {
  return (
    <div className="outermostContainer flex flex-col min-h-screen bg-[#1C1C1C] text-[#F5E8D8]">
     
      <header className="bg-gray-800 text-white p-4 fixed top-0 w-full z-10">
        <Navbar></Navbar>
      </header>

      <div className="flex flex-col flex-1 pt-20 pb-16 min-h-screen">
  {/* Container flex direction changes for desktop */}
  <div className="flex flex-col md:flex-row w-full flex-1">
    
    {/* Sidebar visible on all screens, sticky only on md+ */}
    <aside className="p-4 w-full md:w-1/4 md:h-screen md:sticky md:top-20">
      <Sidebar />
    </aside>

    {/* Main content fills remaining space */}
    <main className=" p-4 mb-5 w-full md:w-3/4 overflow-y-auto">
      <div className="">
        <Main />
        
      </div>
    </main>
  </div>
  <section id="Mind">
  <div>
    <Mind></Mind>
  </div>
    </section>
  
</div>



      {/* Footer */}
      <footer className="bg-gray-800 text-white p-4 fixed bottom-0 w-full z-10">
      <div className="text-center text-sm mb-4">
        © 2025 ProductivitY+. All rights reserved.
      </div>
      <div className="flex justify-center space-x-6 text-xl">
        <a href="https://github.com" target="_blank" rel="noopener noreferrer" className="hover:text-gray-400">
          <FontAwesomeIcon icon={faGithub} />
        </a>
        <a href="https://linkedin.com" target="_blank" rel="noopener noreferrer" className="hover:text-gray-400">
          <FontAwesomeIcon icon={faLinkedin} />
        </a>
        <a href="https://twitter.com" target="_blank" rel="noopener noreferrer" className="hover:text-gray-400">
          <FontAwesomeIcon icon={faTwitter} />
        </a>
        <a href="https://twitter.com" target="_blank" rel="noopener noreferrer" className="hover:text-gray-400">
          <FontAwesomeIcon icon={faSquareInstagram} />
        </a>
      </div>
    
      </footer>
    </div>
  );
};

export default App;
